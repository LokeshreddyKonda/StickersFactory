package com.stickers.classes;

public class EmojiStickers extends Sticker{

	@Override
	public EmojiStickers createSticker() {
		
		EmojiStickers sticker = new EmojiStickers();
		
		sticker.chooseSheets();
		sticker.printColors();
		sticker.cutStickers();
		return sticker;
	}

	@Override
	public void display() {
		System.out.println("Emoji stickers created");		
	}

}
