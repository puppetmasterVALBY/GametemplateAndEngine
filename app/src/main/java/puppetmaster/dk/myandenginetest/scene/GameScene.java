package puppetmaster.dk.myandenginetest.scene;

import com.badlogic.gdx.math.Vector2;

import org.andengine.engine.camera.hud.HUD;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.extension.physics.box2d.FixedStepPhysicsWorld;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.util.adt.color.Color;

import puppetmaster.dk.myandenginetest.base.BaseScene;
import puppetmaster.dk.myandenginetest.manager.SceneManager;

/**
 * Created by YTK on 15-09-2014.
 */
public class GameScene extends BaseScene {

    private HUD gameHUD;
    private Text scoreText;
    private int score = 0;
    private PhysicsWorld physicsWorld;


    private void createHUD()
    {
        gameHUD = new HUD();
/*
        // CREATE SCORE TEXT
        scoreText = new Text(20, 420, resourcesManager.font, "Score: 0123456789", new TextOptions(HorizontalAlign.LEFT), vbom);
        scoreText.setAnchorCenter(0, 0);
        scoreText.setText("Score: 0");
        gameHUD.attachChild(scoreText);
*/
        camera.setHUD(gameHUD);
    }
    private void addToScore(int i)
    {
        score += i;
        scoreText.setText("Score: " + score);
    }
    private void createBackground()
    {
        setBackground(new Background(Color.BLUE));
    }
    private void createPhysics()
    {
        physicsWorld = new FixedStepPhysicsWorld(60, new Vector2(0, -17), false);
        registerUpdateHandler(physicsWorld);
    }

    @Override
    public void createScene() {
        createBackground();
        createHUD();
        createPhysics();

    }

    @Override
    public void onBackKeyPressed() {

    }

    @Override
    public SceneManager.SceneType getSceneType() {
        return SceneManager.SceneType.SCENE_GAME;
    }

    @Override
    public void disposeScene() {

    }
}
