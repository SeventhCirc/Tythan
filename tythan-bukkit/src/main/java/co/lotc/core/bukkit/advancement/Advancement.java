package co.lotc.core.bukkit.advancement;

import lombok.Builder;

import javax.annotation.Nullable;
import java.util.List;

@Builder
public class Advancement {
	private String namespace;

	//Display
	@Nullable private String icon;
	@Nullable private String title;
	@Nullable private String description;
	@Nullable private String background;

	@Nullable private String parrent;
	private List<String> critera;

	public void test(){

	}
}
