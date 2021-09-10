package com.stickers.classes;

public class RewardStickers extends Sticker{

	@Override
	public RewardStickers createSticker() {
		
		RewardStickers sticker = new RewardStickers();
		
		sticker.chooseSheets();
		sticker.printColors();
		sticker.cutStickers();
		return sticker;
	}

	@Override
	public void display() {
		System.out.println("Reward Stickers Created");
	}

}
