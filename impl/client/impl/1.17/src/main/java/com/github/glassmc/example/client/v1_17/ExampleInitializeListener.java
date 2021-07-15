package com.github.glassmc.example.client.v1_17;

import com.github.glassmc.example.client.IExampleInterface;
import com.github.glassmc.loader.GlassLoader;
import com.github.glassmc.loader.Listener;

public class ExampleInitializeListener implements Listener {

    @Override
    public void run() {
        GlassLoader.getInstance().registerInterface(IExampleInterface.class, new ExampleInterfaceImpl());
    }

}
