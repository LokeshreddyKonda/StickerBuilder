package stickers;


public abstract class StickerBuilder {

	String name;
	String stickerType;
	String material;
	String[] colors;
	Sticker stickerobj = null;
	
	public void setStickerBuilder(String name,String stickerType) {
		this.name = name;
		this.stickerType = stickerType;
		stickerobj = new Sticker(this.name,this.stickerType);
	}
	
	public abstract StickerBuilder setStickerColors();
	
	public abstract StickerBuilder StickerMaterial();
	
	public Sticker Build() {
		System.out.println("Sticker Builder Success");
		return stickerobj;
	}
}
