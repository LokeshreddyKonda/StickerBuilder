package stickers;

public class StickerMain {

	public static void main(String[] args) {
		String[] colors = {"red","green","white"};
		CartoonStickerBuilder builder = new CartoonStickerBuilder("cartoon",colors);
		builder.setStickerBuilder("sticker", "plastic");
		builder.setStickerColors();
		builder.StickerMaterial();
		Sticker build2 = builder.Build();
		System.out.println(build2.toString());
		EmojieStickerBuilder bu = new EmojieStickerBuilder("eojies",colors);
		bu.setStickerBuilder("lokesh","cartoonStickers");
		bu.setStickerColors();
		bu.StickerMaterial();
		Sticker build = bu.Build();
		System.out.println(build.toString());
	}
	
}
