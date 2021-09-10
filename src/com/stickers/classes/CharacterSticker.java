package com.stickers.classes;

public class CharacterSticker extends Sticker{

	@Override
	public CharacterSticker createSticker() {
		
		CharacterSticker sticker = new CharacterSticker();
		
		sticker.chooseSheets();
		sticker.printColors();
		sticker.cutStickers();
		return sticker;
	}

	@Override
	public void display() {
		System.out.println("Character Stickers Created");
	}

}
