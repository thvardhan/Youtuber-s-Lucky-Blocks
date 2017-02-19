package thvardhan.ytluckyblocks.blocks;

import java.util.Random;

import thvardhan.ytluckyblocks.CommonProxy;
import thvardhan.ytluckyblocks.functions.ExtraFunctions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class YoutubeBlock extends Block {

	public YoutubeBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CommonProxy.tabYTStuffMod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(0F);
    }
	
	public YoutubeBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, 0, 10000);
    }

    public YoutubeBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
    
    
    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
    	if(!worldIn.isRemote){
    	Random rand=new Random();
    	switch(rand.nextInt(46)){
    	case 0:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.youtubeLuckyBlock);	
    		break;}
    	case 1:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.antVenomLuckyBlock);	
    		break;
    	}
    	case 2:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.captainSparkelzLuckyBlock);	
    		break;
    	}
    	case 3:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.danTDMLuckyBlock);	
    		break;
    	}
    	case 4:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.gamingWithJenLuckyBlock);	
    		break;
    	}
    	case 5:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.iBallisticSquidLuckyBlock);	
    		break;
    	}
    	case 6:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.popularMMOLuckyBlock);	
    		break;
    	}
    	case 7:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.serialPlayerLuckyBlock);	
    		break;
    	}
    	case 8:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.skyDoesMinecraftLuckyBlock);	
    		break;
    	}
    	case 9:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.alexircraftLuckyBlock);
    		break;
    	}case 10:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.bajanCanadianLuckyBlock);
    		break;
    	}case 11:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.frizzleandpopLuckyBlock);
    		break;
    	}case 12:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.jeromeASFLuckyBlock);
    		break;
    	}case 13:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.tewityLuckyBlock);
    		break;
    	}case 14:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.trueMuLuckyBlock);
    		break;
    	}
    	case 15:{
    	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.iHasCupcakeLuckyBlock);
    		break;
    	}
    	case 16:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.lDShadowLadyLuckyBlock);
    		break;
    	}
    	case 17:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.prestonPlayzLuckyBlock);
    		break;
    	}
    	case 18:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.sSundeeLuckyBlock);
    		break;
    	}
    	case 19:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.stampylongheadLuckyBlock);
    		break;
    	}
    	case 20:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.thnxCyaLuckyBlock);
    		break;
    	}
    	case 21:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.exploadingTNTLuckyBlock);
    		break;
    	}case 22:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.lachlanLuckyBlock);
    		break;
    	}case 23:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mrwooflessLuckyBlock);
    		break;
    	}case 24:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.petaZahHuttLuckyBlock);
    		break;
    	}case 25:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.pinkSheepYTLuckyBlock);
    		break;
    	}case 26:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.vikkstar123LuckyBlock);
    		break;
    	}case 27:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.babyDuckLuckyBlock);
    		break;
    	}case 28:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.babyLeahLuckyBlock);
    		break;
    	}case 29:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.babyMaxLuckyBlock);
    		break;
    	}case 30:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.cassieTheCatLuckyBlock);
    		break;
    	}case 31:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.donutTheDogLuckyBlock);
    		break;
    	}case 32:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.evilLittleKellyLuckyBlock);
    		break;
    	}case 33:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleAllyLuckyBlock);
    		break;
    	}case 34:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleCarlyMcLuckyBlock);
    		break;
    	}case 35:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleDonnyLuckyBlock);
    		break;
    	}case 36:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleKellyMcLuckyBlock);
    		break;
    	}case 37:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleLizardGamingLuckyBlock);
    		break;
    	}case 38:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.maxTheMonkeyLuckyBlock);
    		break;
    	}case 39:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.sharkyLuckyBlock);
    		break;
    	}case 40:{
        	ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.tinyTurtleLuckyBlock);
    		break;
    	}case 41:{
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.aphmauLuckyBlock);
				break;
			}case 42:{
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleAngelLuckyBlock);
                break;
            }case 43:{
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.scubaSteveLuckyBlock);
                break;
            }case 44:{
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.littleRopoLuckyBlock);
                break;
            }case 45:{
                ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.mrCrainerLuckyBlock);
                break;
            }
    	default:{
    		ExtraFunctions.summonBlockAsDrop(pos, worldIn, ModBlocks.goldButton);
    	}
    		
    		
    	}
    	}
    }
    
    
}
