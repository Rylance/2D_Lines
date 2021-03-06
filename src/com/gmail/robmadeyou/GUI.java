package com.gmail.robmadeyou;

public class GUI {
	
	public static void Draw(int i, String state){
		if(guiButton.button[i] != null){
			if(guiButton.button[i].area == state){
				guiButton.button[i].draw();
			}
		}
		if(Game.state == "LEVEL_SELECT" && i < 64){
			if(guiLevels.levels[i] != null){
				guiLevels.levels[i].draw();
			}
		}
		if(Game.state == "GAME"){
			for(int r = 0; r < 128; r++){
				if( r < 127 && Player.lines[r]!= null){
					Player.lines[r].draw();
				}
				if(Player.dots[r] != null){
					Player.dots[r].draw();
					if(Player.dots[r] != null && Player.dots[r + 1] != null){
						Player.lines[r] = new Player.Lines(Player.dots[r].x, Player.dots[r].y, Player.dots[r + 1].x, Player.dots[r + 1].y, StateGame.pointColour);
					}
				}
			}
		}
		
	}
}
