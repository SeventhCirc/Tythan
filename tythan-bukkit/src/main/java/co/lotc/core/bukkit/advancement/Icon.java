package co.lotc.core.bukkit.advancement;
import org.bukkit.Material;

public class Icon {
	private final String material;
	private final String nbt;

	private Icon(IconBuilder iconBuilder){
		material = iconBuilder.material.getKey().toString();
		nbt = iconBuilder.nbt;
	}

	public String getMaterial() {
		return material;
	}

	public String getNbt() {
		return nbt;
	}

	public static class IconBuilder{
		private Material material;
		private String nbt;

		public IconBuilder setMaterial(Material material) {
			this.material = material;
			return this;
		}

		public IconBuilder setNbt(String nbt) {
			this.nbt = nbt;
			return this;
		}

		public Icon build(){
			return new Icon(this);
		}
	}
}
