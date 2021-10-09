package stickers;

public class EmojieStickerBuilder extends StickerBuilder{

	String material;
	String[] colors;
	
	EmojieStickerBuilder(String material,String[] colors){
		this.material=material;
		this.colors=colors;
	}
	
	@Override
	public StickerBuilder setStickerColors() {
		stickerobj.setStickerColors(this.colors);
		return this;
	}

	@Override
	public StickerBuilder StickerMaterial() {
		stickerobj.setStickerMaterial(this.material);
		return this;
	}

}
