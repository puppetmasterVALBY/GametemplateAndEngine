package puppetmaster.dk.myandenginetest.scene;

import org.andengine.entity.scene.background.Background;

import org.andengine.entity.text.Text;
import org.andengine.opengl.font.Font;
import org.andengine.opengl.font.FontFactory;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.util.adt.color.Color;

import puppetmaster.dk.myandenginetest.base.BaseScene;
import puppetmaster.dk.myandenginetest.manager.SceneManager;

/**
 * Created by Claus on 12-09-2014.
 */
public class LoadingScene extends BaseScene
{




    @Override
    public void createScene()
    {
        setBackground(new Background(Color.WHITE));
//        attachChild(new Text(400, 240, resourcesManager.font, "Loading...", vbom));
    }
    @Override
    public void onBackKeyPressed()
    {
        return;
    }

    @Override
    public SceneManager.SceneType getSceneType()
    {
        return SceneManager.SceneType.SCENE_LOADING;
    }

    @Override
    public void disposeScene()
    {

    }


}
