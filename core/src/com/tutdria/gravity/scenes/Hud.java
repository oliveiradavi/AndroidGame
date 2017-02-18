package com.tutdria.gravity.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.tutdria.gravity.GravityGame;

public class Hud {

    public Stage stage;
    private Viewport viewport;

    private Integer worldTimer;
    private float timeCount;
    private int score;

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label gravityLabel;

    public Hud(SpriteBatch sb) {
        worldTimer = 300;
        timeCount = 0;
        score = 0;

        viewport = new FitViewport(GravityGame.V_WIDTH,GravityGame.V_HEIGHT,new OrthographicCamera());
        stage = new Stage(viewport,sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        countdownLabel = new Label(String.format("%03d", worldTimer),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel = new Label(String.format("%06d", score),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        timeLabel = new Label(String.format("TIME"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        worldLabel = new Label(String.format("WORLD"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        levelLabel =  new Label(String.format("1-1"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        gravityLabel = new Label(String.format("GRAVITY"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(gravityLabel).expandX();
        table.add(worldLabel).expandX();
        table.add(timeLabel).expandX();
        table.row();
        table.add(scoreLabel).expandX();
        table.add(levelLabel).expandX();
        table.add(countdownLabel).expandX();

        stage.addActor(table);
    }


}
