package com.stickers.classes;

public class StickerMakingMain {
	
	public static void finalSampleObjectCreated(Object obj){
		if(obj instanceof CharacterSticker) {
			System.out.println("CharacterSticker created");
		}else if(obj instanceof RewardStickers) {
			System.out.println("RewardStickers created");
		}else if(obj instanceof EmojiStickers) {
			System.out.println("EmojiStickers created");
		}
	}
	public static void main(String[] args) {
		
		
		FactoryClass factory = new FactoryClass();
		factory.setType("emoji");
		Object factoryCreatedStickers = factory.getFactoryCreatedStickers();
		finalSampleObjectCreated(factoryCreatedStickers);
		
		factory.setType("character");
		Object factoryCreatedStickers1 = factory.getFactoryCreatedStickers();
		finalSampleObjectCreated(factoryCreatedStickers1);
		
		factory.setType("reward");
		Object factoryCreatedStickers2 = factory.getFactoryCreatedStickers();
		finalSampleObjectCreated(factoryCreatedStickers2);
		
		
	}

}
