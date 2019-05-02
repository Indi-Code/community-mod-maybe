package communitymod;

import net.fabricmc.api.ModInitializer;

public class CommunityMod implements ModInitializer {
    public static final String MODID = "communitymod";
    @Override
    public void onInitialize() {
        TinyPotato.makeMeSumPotatoz();
    }
}
