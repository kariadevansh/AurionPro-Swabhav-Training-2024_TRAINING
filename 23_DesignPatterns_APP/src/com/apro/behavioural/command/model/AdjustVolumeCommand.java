package com.apro.behavioural.command.model;

public class AdjustVolumeCommand implements ICommand {
    private Stereo stereo;
 
    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }
 
    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
