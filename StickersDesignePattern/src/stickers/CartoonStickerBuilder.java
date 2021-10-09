package stickers;

public class CartoonStickerBuilder extends StickerBuilder{

	String material;
	String[] colors;
	
	CartoonStickerBuilder(String material,String[] colors){
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
