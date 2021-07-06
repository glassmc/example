package io.github.glassmc.example.client;

import io.github.glassmc.loader.GlassLoader;
import io.github.glassmc.loader.Listener;

public class ExampleClientInitializeListener implements Listener {

    @Override
    public void run() {
        System.out.println("Am I currently on MAC (retrieved from minecraft)? " + GlassLoader.getInstance().getInterface(IExampleInterface.class).isMAC());
    }

}
