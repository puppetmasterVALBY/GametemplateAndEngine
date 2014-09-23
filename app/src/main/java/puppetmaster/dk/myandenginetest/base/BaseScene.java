package puppetmaster.dk.myandenginetest.base;

/**
 * Created by Claus on 09-09-2014.
 */

import org.andengine.engine.camera.BoundCamera;
import org.andengine.engine.Engine;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.app.Activity;

import puppetmaster.dk.myandenginetest.ResourcesManager;
import puppetmaster.dk.myandenginetest.manager.SceneManager;
import puppetmaster.dk.myandenginetest.scene.AddScene;

public abstract class BaseScene extends AddScene {
    //---------------------------------------------
    // VARIABLES
    //---------------------------------------------

    protected Engine engine;
    protected Activity activity;
    protected ResourcesManager resourcesManager;
    protected VertexBufferObjectManager vbom;
    protected BoundCamera camera;

    //---------------------------------------------
    // CONSTRUCTOR
    //---------------------------------------------

    public BaseScene()
    {
        this.resourcesManager = ResourcesManager.getInstance();
        this.engine = resourcesManager.engine;
        this.activity = resourcesManager.activity;
        this.vbom = resourcesManager.vbom;
        this.camera = resourcesManager.camera;
        createScene();
    }

    //---------------------------------------------
    // ABSTRACTION
    //---------------------------------------------

    public abstract void createScene();

    public abstract void onBackKeyPressed();

    public abstract SceneManager.SceneType getSceneType();

    public abstract void disposeScene();
}
