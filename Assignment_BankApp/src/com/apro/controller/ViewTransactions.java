package com.apro.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apro.entity.Transactions;
import com.apro.model.DBUtil;

@WebServlet("/ViewTransactions")
public class ViewTransactions extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ViewTransactions() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBUtil dbUtil = (DBUtil) session.getAttribute("dbUtil");

        if (dbUtil == null || !dbUtil.isConnectionValid()) {
	        // Attempt to reconnect if DBUtil is null or connection is not valid
	        dbUtil = DBUtil.getDBUtil();
	        dbUtil.connectToDb();
	        session.setAttribute("dbUtil", dbUtil);

	        // Check if reconnection was successful
	        if (!dbUtil.isConnectionValid()) {
	            request.setAttribute("message", "Database connection is not available.");
	            RequestDispatcher dispatcher = request.getRequestDispatcher("AdminPanel.jsp?action=addAccount");
	            dispatcher.forward(request, response);
	            return;
	        }
	    } else {
            System.out.println("DBUtil successfully retrieved from session.");
        }

        try {
            List<Transactions> transactions = dbUtil.getAllTransactions();
            System.out.println("Number of transactions retrieved: " + (transactions != null ? transactions.size() : 0));

            request.setAttribute("transactions", transactions);
            request.setAttribute("action", "viewTransactions");

            RequestDispatcher dispatcher = request.getRequestDispatcher("AdminPanel.jsp?action=viewTransactions");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            System.err.println("SQL Exception while retrieving transactions.");
            e.printStackTrace();
            request.setAttribute("message", "An error occurred while retrieving transaction data.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
