package com.github.glassmc.example.client.v1_18_1;

import com.github.glassmc.example.client.IExampleInterface;
import com.github.glassmc.loader.api.GlassLoader;
import com.github.glassmc.loader.api.Listener;

public class ExampleInitializeListener implements Listener {

    @Override
    public void run() {
        GlassLoader.getInstance().registerInterface(IExampleInterface.class, new ExampleInterfaceImpl());
    }

}
