package com.github.glassmc.example.client;

import com.github.glassmc.loader.api.GlassLoader;
import com.github.glassmc.loader.api.Listener;

public class ExampleClientInitializeListener implements Listener {

    @Override
    public void run() {
        System.out.println("Am I currently on MAC (retrieved from minecraft)? " + GlassLoader.getInstance().getInterface(IExampleInterface.class).isMAC());
    }

}
