/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shooter;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopGame {
        public static void main (String[] args) {
                new LwjglApplication(new Game(), "Game", 480, 420, false);
        }
}