package com.stickers.classes;

public class FactoryClass {

	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Object getFactoryCreatedStickers() {
			
		if("character".equals(this.type)) {
			CharacterSticker sticker = new CharacterSticker();
			CharacterSticker createSticker = sticker.createSticker();
			return createSticker;
		}else if("reward".equals(this.type)) {
			RewardStickers sticker = new RewardStickers();
			RewardStickers createSticker = sticker.createSticker();
			return createSticker;
		}else if("emoji".equals(this.type)) {
			EmojiStickers sticker = new EmojiStickers();
			EmojiStickers createSticker = sticker.createSticker();
			return createSticker;
		}
		return null;
	}
}
