package com.apro.behavioural.command.test;

import com.apro.behavioural.command.model.AdjustVolumeCommand;
import com.apro.behavioural.command.model.ChangeChannelCommand;
import com.apro.behavioural.command.model.ICommand;
import com.apro.behavioural.command.model.RemoteControl;
import com.apro.behavioural.command.model.Stereo;
import com.apro.behavioural.command.model.TV;
import com.apro.behavioural.command.model.TurnOffCommand;
import com.apro.behavioural.command.model.TurnOnCommand;

public class RemoteCommandTest {

	public static void main(String[] args) {
		TV tv = new TV();
		Stereo stereo = new Stereo();

		ICommand turnOnTVCommand = new TurnOnCommand(tv);
		ICommand turnOffTVCommand = new TurnOffCommand(tv);
		ICommand adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
		ICommand changeChannelTVCommand = new ChangeChannelCommand(tv);

		RemoteControl remote = new RemoteControl();

		remote.setCommand(turnOnTVCommand);
		remote.pressButton(); 

		remote.setCommand(adjustVolumeStereoCommand);
		remote.pressButton(); 

		remote.setCommand(changeChannelTVCommand);
		remote.pressButton(); 

		remote.setCommand(turnOffTVCommand);
		remote.pressButton();
		
		
		
		remote.setCommand(new TurnOnCommand(stereo));
		remote.pressButton();
		
		remote.setCommand(adjustVolumeStereoCommand);
		remote.pressButton();
	}

}
