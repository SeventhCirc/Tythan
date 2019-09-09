package co.lotc.core.bukkit.advancement;

import lombok.Builder;

import javax.annotation.Nullable;
import java.util.List;

@Builder
public class Advancement {

	//Root Tag
	private String roottag;

	//Display - Optional
	@Nullable private Icon icon;
	@Nullable private String title;
	@Nullable private String jsontitle;
	@Nullable private String background;
	@Nullable private String description;
	@Nullable private String jsondescription;
	@Nullable private Boolean show_toast;
	@Nullable private Boolean announce_to_chat;
	@Nullable private Boolean hidden;

	//Parent - Optional
	@Nullable private String parrent;

	//Criteria
	private List<Critera> criteras;

	//Rewards - Optional
	@Nullable private List<String> recipies;
	@Nullable private List<String> loots;
	@Nullable private Integer experience;
	@Nullable private String function;

	public void test(){
		icon

	}
}
