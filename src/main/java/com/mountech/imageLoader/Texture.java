package com.mountech.imageLoader;

import java.awt.image.BufferedImage;

public class Texture {
    private int playerH = 112, playerW = 51;
    private int blockH = 32, blockW = 32;
    private int mushroomEnemyH = 25, mushroomEnemyW = 30;
    private int duckEnemyH = 25, duckEnemyW = 30;

    private SpriteSheet ps, bs, es;
    private BufferedImage block_sheet = null;
    private BufferedImage player_sheet = null;
    private BufferedImage enemy_sheet = null;

    public BufferedImage[] block = new BufferedImage[2];
    public BufferedImage[] playerFaceRight = new BufferedImage[5];
    public BufferedImage[] playerFaceLeft = new BufferedImage[5];
    public BufferedImage[] mushroomEnemy = new BufferedImage[3];
    public BufferedImage[] duckEnemy = new BufferedImage[5];


    public Texture(){
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            block_sheet = loader.loadImage("/block_sheet.png");
            player_sheet = loader.loadImage("/Left_Right_Player.png");
            enemy_sheet = loader.loadImage("/enemy.png");
        }catch (Exception e){
            e.printStackTrace();
        }
        bs = new SpriteSheet(block_sheet);
        ps = new SpriteSheet(player_sheet);
        es = new SpriteSheet(enemy_sheet);
        getTextures();
    }

    private void getTextures(){
        block[0] = bs.grabImage(1, 1, blockW, blockH); // Wall block
        block[1] = bs.grabImage(2, 1, blockW, blockH); // Grass block

        playerFaceRight[0] = ps.grabImage(1, 1, playerW, playerH);
        playerFaceRight[1] = ps.grabImage(2, 1, playerW, playerH);
        playerFaceRight[2] = ps.grabImage(3, 1, playerW, playerH);
        playerFaceRight[3] = ps.grabImage(4, 1, playerW, playerH);
        playerFaceRight[4] = ps.grabImage(5, 1, playerW, playerH);

        playerFaceLeft[0] = ps.grabImage(6, 1, playerW, playerH);
        playerFaceLeft[1] = ps.grabImage(7, 1, playerW, playerH);
        playerFaceLeft[2] = ps.grabImage(8, 1, playerW, playerH);
        playerFaceLeft[3] = ps.grabImage(9, 1, playerW, playerH);
        playerFaceLeft[4] = ps.grabImage(10,1, playerW, playerH);

        mushroomEnemy[0] = es.grabImage(1, 1, mushroomEnemyW, mushroomEnemyH);
        mushroomEnemy[1] = es.grabImage(2, 1, mushroomEnemyW, mushroomEnemyH);
        mushroomEnemy[2] = es.grabImage(3, 1, mushroomEnemyW, mushroomEnemyH);

        duckEnemy[0] = es.grabImage(6, 1, duckEnemyW, duckEnemyH);
        duckEnemy[1] = es.grabImage(7, 1, duckEnemyW, duckEnemyH);
        duckEnemy[2] = es.grabImage(8, 1, duckEnemyW, duckEnemyH);
        duckEnemy[3] = es.grabImage(9, 1, duckEnemyW, duckEnemyH);

        duckEnemy[4] = es.grabImage(13, 1, duckEnemyW, duckEnemyH); //this stores the dead ememy
    }
}
