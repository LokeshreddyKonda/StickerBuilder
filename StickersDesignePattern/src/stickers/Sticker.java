package stickers;

public class Sticker {
	String name;
	String stickerType;
	String material;
	String[] colors;
	
	Sticker(String name,String stickerType){
		this.name = name;
		this.stickerType = stickerType;
	}
	
	public Sticker setStickerMaterial(String material) {
		this.material = material;
		return this;
	}
	
	public Sticker setStickerColors(String[] colors) {
		this.colors = colors;
		return this;
	}
	
}
