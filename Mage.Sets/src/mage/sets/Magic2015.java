/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import java.util.GregorianCalendar;
import mage.cards.ExpansionSet;
import mage.constants.SetType;
import mage.constants.Rarity;
import java.util.List;
import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.FrameStyle;

/**
 *
 * @author LevelX2
 */
public class Magic2015 extends ExpansionSet {

    private static final Magic2015 fINSTANCE = new Magic2015();

    public static Magic2015 getInstance() {
        return fINSTANCE;
    }

    private Magic2015() {
        super("Magic 2015", "M15", "mage.sets.magic2015", new GregorianCalendar(2014, 7, 18).getTime(), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 269;
        cards.add(new SetCardInfo("Accursed Spirit", 85, Rarity.COMMON, mage.cards.a.AccursedSpirit.class));
        cards.add(new SetCardInfo("Act on Impulse", 126, Rarity.UNCOMMON, mage.cards.a.ActOnImpulse.class));
        cards.add(new SetCardInfo("Aegis Angel", 270, Rarity.RARE, mage.cards.a.AegisAngel.class));
        cards.add(new SetCardInfo("Aeronaut Tinkerer", 43, Rarity.COMMON, mage.cards.a.AeronautTinkerer.class));
        cards.add(new SetCardInfo("Aetherspouts", 44, Rarity.RARE, mage.cards.a.Aetherspouts.class));
        cards.add(new SetCardInfo("Aggressive Mining", 127, Rarity.RARE, mage.cards.a.AggressiveMining.class));
        cards.add(new SetCardInfo("Ajani's Pridemate", 2, Rarity.UNCOMMON, mage.cards.a.AjanisPridemate.class));
        cards.add(new SetCardInfo("Ajani Steadfast", 1, Rarity.MYTHIC, mage.cards.a.AjaniSteadfast.class));
        cards.add(new SetCardInfo("Altac Bloodseeker", 128, Rarity.UNCOMMON, mage.cards.a.AltacBloodseeker.class));
        cards.add(new SetCardInfo("Amphin Pathmage", 45, Rarity.COMMON, mage.cards.a.AmphinPathmage.class));
        cards.add(new SetCardInfo("Ancient Silverback", 168, Rarity.UNCOMMON, mage.cards.a.AncientSilverback.class));
        cards.add(new SetCardInfo("Avacyn, Guardian Angel", 3, Rarity.RARE, mage.cards.a.AvacynGuardianAngel.class));
        cards.add(new SetCardInfo("Avarice Amulet", 212, Rarity.RARE, mage.cards.a.AvariceAmulet.class));
        cards.add(new SetCardInfo("Back to Nature", 169, Rarity.UNCOMMON, mage.cards.b.BackToNature.class));
        cards.add(new SetCardInfo("Battlefield Forge", 240, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Battle Mastery", 4, Rarity.UNCOMMON, mage.cards.b.BattleMastery.class));
        cards.add(new SetCardInfo("Belligerent Sliver", 129, Rarity.UNCOMMON, mage.cards.b.BelligerentSliver.class));
        cards.add(new SetCardInfo("Black Cat", 86, Rarity.COMMON, mage.cards.b.BlackCat.class));
        cards.add(new SetCardInfo("Blastfire Bolt", 130, Rarity.COMMON, mage.cards.b.BlastfireBolt.class));
        cards.add(new SetCardInfo("Blood Host", 87, Rarity.UNCOMMON, mage.cards.b.BloodHost.class));
        cards.add(new SetCardInfo("Boonweaver Giant", 5, Rarity.UNCOMMON, mage.cards.b.BoonweaverGiant.class));
        cards.add(new SetCardInfo("Borderland Marauder", 131, Rarity.COMMON, mage.cards.b.BorderlandMarauder.class));
        cards.add(new SetCardInfo("Brawler's Plate", 213, Rarity.UNCOMMON, mage.cards.b.BrawlersPlate.class));
        cards.add(new SetCardInfo("Bronze Sable", 214, Rarity.COMMON, mage.cards.b.BronzeSable.class));
        cards.add(new SetCardInfo("Brood Keeper", 132, Rarity.UNCOMMON, mage.cards.b.BroodKeeper.class));
        cards.add(new SetCardInfo("Burning Anger", 133, Rarity.RARE, mage.cards.b.BurningAnger.class));
        cards.add(new SetCardInfo("Cancel", 274, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Carnivorous Moss-Beast", 170, Rarity.COMMON, mage.cards.c.CarnivorousMossBeast.class));
        cards.add(new SetCardInfo("Carrion Crow", 88, Rarity.COMMON, mage.cards.c.CarrionCrow.class));
        cards.add(new SetCardInfo("Caustic Tar", 89, Rarity.UNCOMMON, mage.cards.c.CausticTar.class));
        cards.add(new SetCardInfo("Caves of Koilos", 241, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Centaur Courser", 282, Rarity.COMMON, mage.cards.c.CentaurCourser.class));
        cards.add(new SetCardInfo("Chandra, Pyromaster", 134, Rarity.MYTHIC, mage.cards.c.ChandraPyromaster.class));
        cards.add(new SetCardInfo("Charging Rhino", 171, Rarity.COMMON, mage.cards.c.ChargingRhino.class));
        cards.add(new SetCardInfo("Chasm Skulker", 46, Rarity.RARE, mage.cards.c.ChasmSkulker.class));
        cards.add(new SetCardInfo("Chief Engineer", 47, Rarity.RARE, mage.cards.c.ChiefEngineer.class));
        cards.add(new SetCardInfo("Child of Night", 90, Rarity.COMMON, mage.cards.c.ChildOfNight.class));
        cards.add(new SetCardInfo("Chord of Calling", 172, Rarity.RARE, mage.cards.c.ChordOfCalling.class));
        cards.add(new SetCardInfo("Chronostutter", 48, Rarity.COMMON, mage.cards.c.Chronostutter.class));
        cards.add(new SetCardInfo("Circle of Flame", 135, Rarity.UNCOMMON, mage.cards.c.CircleOfFlame.class));
        cards.add(new SetCardInfo("Clear a Path", 136, Rarity.COMMON, mage.cards.c.ClearAPath.class));
        cards.add(new SetCardInfo("Cone of Flame", 137, Rarity.UNCOMMON, mage.cards.c.ConeOfFlame.class));
        cards.add(new SetCardInfo("Congregate", 6, Rarity.UNCOMMON, mage.cards.c.Congregate.class));
        cards.add(new SetCardInfo("Constricting Sliver", 7, Rarity.UNCOMMON, mage.cards.c.ConstrictingSliver.class));
        cards.add(new SetCardInfo("Coral Barrier", 49, Rarity.COMMON, mage.cards.c.CoralBarrier.class));
        cards.add(new SetCardInfo("Covenant of Blood", 91, Rarity.COMMON, mage.cards.c.CovenantOfBlood.class));
        cards.add(new SetCardInfo("Crippling Blight", 92, Rarity.COMMON, mage.cards.c.CripplingBlight.class));
        cards.add(new SetCardInfo("Crowd's Favor", 138, Rarity.COMMON, mage.cards.c.CrowdsFavor.class));
        cards.add(new SetCardInfo("Crucible of Fire", 139, Rarity.RARE, mage.cards.c.CrucibleOfFire.class));
        cards.add(new SetCardInfo("Cruel Sadist", 93, Rarity.RARE, mage.cards.c.CruelSadist.class));
        cards.add(new SetCardInfo("Darksteel Citadel", 242, Rarity.UNCOMMON, mage.cards.d.DarksteelCitadel.class));
        cards.add(new SetCardInfo("Dauntless River Marshal", 8, Rarity.UNCOMMON, mage.cards.d.DauntlessRiverMarshal.class));
        cards.add(new SetCardInfo("Devouring Light", 9, Rarity.UNCOMMON, mage.cards.d.DevouringLight.class));
        cards.add(new SetCardInfo("Diffusion Sliver", 50, Rarity.UNCOMMON, mage.cards.d.DiffusionSliver.class));
        cards.add(new SetCardInfo("Dissipate", 51, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Divination", 52, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Divine Favor", 10, Rarity.COMMON, mage.cards.d.DivineFavor.class));
        cards.add(new SetCardInfo("Divine Verdict", 271, Rarity.COMMON, mage.cards.d.DivineVerdict.class));
        cards.add(new SetCardInfo("Elvish Mystic", 173, Rarity.COMMON, mage.cards.e.ElvishMystic.class));
        cards.add(new SetCardInfo("Encrust", 53, Rarity.COMMON, mage.cards.e.Encrust.class));
        cards.add(new SetCardInfo("Endless Obedience", 94, Rarity.UNCOMMON, mage.cards.e.EndlessObedience.class));
        cards.add(new SetCardInfo("Ensoul Artifact", 54, Rarity.UNCOMMON, mage.cards.e.EnsoulArtifact.class));
        cards.add(new SetCardInfo("Ephemeral Shields", 11, Rarity.COMMON, mage.cards.e.EphemeralShields.class));
        cards.add(new SetCardInfo("Eternal Thirst", 95, Rarity.COMMON, mage.cards.e.EternalThirst.class));
        cards.add(new SetCardInfo("Evolving Wilds", 243, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Feast on the Fallen", 96, Rarity.UNCOMMON, mage.cards.f.FeastOnTheFallen.class));
        cards.add(new SetCardInfo("Feral Incarnation", 174, Rarity.UNCOMMON, mage.cards.f.FeralIncarnation.class));
        cards.add(new SetCardInfo("Festergloom", 97, Rarity.COMMON, mage.cards.f.Festergloom.class));
        cards.add(new SetCardInfo("First Response", 12, Rarity.UNCOMMON, mage.cards.f.FirstResponse.class));
        cards.add(new SetCardInfo("Flesh to Dust", 98, Rarity.COMMON, mage.cards.f.FleshToDust.class));
        cards.add(new SetCardInfo("Forest", 266, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 267, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 268, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 269, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forge Devil", 140, Rarity.COMMON, mage.cards.f.ForgeDevil.class));
        cards.add(new SetCardInfo("Foundry Street Denizen", 141, Rarity.COMMON, mage.cards.f.FoundryStreetDenizen.class));
        cards.add(new SetCardInfo("Frenzied Goblin", 142, Rarity.UNCOMMON, mage.cards.f.FrenziedGoblin.class));
        cards.add(new SetCardInfo("Frost Lynx", 55, Rarity.COMMON, mage.cards.f.FrostLynx.class));
        cards.add(new SetCardInfo("Fugitive Wizard", 56, Rarity.COMMON, mage.cards.f.FugitiveWizard.class));
        cards.add(new SetCardInfo("Furnace Whelp", 279, Rarity.UNCOMMON, mage.cards.f.FurnaceWhelp.class));
        cards.add(new SetCardInfo("Gargoyle Sentinel", 216, Rarity.UNCOMMON, mage.cards.g.GargoyleSentinel.class));
        cards.add(new SetCardInfo("Garruk, Apex Predator", 210, Rarity.MYTHIC, mage.cards.g.GarrukApexPredator.class));
        cards.add(new SetCardInfo("Garruk's Packleader", 283, Rarity.UNCOMMON, mage.cards.g.GarruksPackleader.class));
        cards.add(new SetCardInfo("Gather Courage", 175, Rarity.UNCOMMON, mage.cards.g.GatherCourage.class));
        cards.add(new SetCardInfo("Geist of the Moors", 13, Rarity.UNCOMMON, mage.cards.g.GeistOfTheMoors.class));
        cards.add(new SetCardInfo("Generator Servant", 143, Rarity.COMMON, mage.cards.g.GeneratorServant.class));
        cards.add(new SetCardInfo("Genesis Hydra", 176, Rarity.RARE, mage.cards.g.GenesisHydra.class));
        cards.add(new SetCardInfo("Glacial Crasher", 57, Rarity.COMMON, mage.cards.g.GlacialCrasher.class));
        cards.add(new SetCardInfo("Goblin Kaboomist", 144, Rarity.RARE, mage.cards.g.GoblinKaboomist.class));
        cards.add(new SetCardInfo("Goblin Rabblemaster", 145, Rarity.RARE, mage.cards.g.GoblinRabblemaster.class));
        cards.add(new SetCardInfo("Goblin Roughrider", 146, Rarity.COMMON, mage.cards.g.GoblinRoughrider.class));
        cards.add(new SetCardInfo("Gravedigger", 99, Rarity.UNCOMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grindclock", 217, Rarity.RARE, mage.cards.g.Grindclock.class));
        cards.add(new SetCardInfo("Hammerhand", 147, Rarity.COMMON, mage.cards.h.Hammerhand.class));
        cards.add(new SetCardInfo("Haunted Plate Mail", 218, Rarity.RARE, mage.cards.h.HauntedPlateMail.class));
        cards.add(new SetCardInfo("Heat Ray", 148, Rarity.UNCOMMON, mage.cards.h.HeatRay.class));
        cards.add(new SetCardInfo("Heliod's Pilgrim", 14, Rarity.COMMON, mage.cards.h.HeliodsPilgrim.class));
        cards.add(new SetCardInfo("Hoarding Dragon", 149, Rarity.RARE, mage.cards.h.HoardingDragon.class));
        cards.add(new SetCardInfo("Hornet Nest", 177, Rarity.RARE, mage.cards.h.HornetNest.class));
        cards.add(new SetCardInfo("Hornet Queen", 178, Rarity.RARE, mage.cards.h.HornetQueen.class));
        cards.add(new SetCardInfo("Hot Soup", 219, Rarity.UNCOMMON, mage.cards.h.HotSoup.class));
        cards.add(new SetCardInfo("Hunter's Ambush", 180, Rarity.COMMON, mage.cards.h.HuntersAmbush.class));
        cards.add(new SetCardInfo("Hunt the Weak", 179, Rarity.COMMON, mage.cards.h.HuntTheWeak.class));
        cards.add(new SetCardInfo("Hushwing Gryff", 15, Rarity.RARE, mage.cards.h.HushwingGryff.class));
        cards.add(new SetCardInfo("Hydrosurge", 58, Rarity.COMMON, mage.cards.h.Hydrosurge.class));
        cards.add(new SetCardInfo("Illusory Angel", 59, Rarity.UNCOMMON, mage.cards.i.IllusoryAngel.class));
        cards.add(new SetCardInfo("Indulgent Tormentor", 101, Rarity.RARE, mage.cards.i.IndulgentTormentor.class));
        cards.add(new SetCardInfo("Inferno Fist", 150, Rarity.COMMON, mage.cards.i.InfernoFist.class));
        cards.add(new SetCardInfo("In Garruk's Wake", 100, Rarity.RARE, mage.cards.i.InGarruksWake.class));
        cards.add(new SetCardInfo("Inspired Charge", 272, Rarity.COMMON, mage.cards.i.InspiredCharge.class));
        cards.add(new SetCardInfo("Into the Void", 60, Rarity.UNCOMMON, mage.cards.i.IntoTheVoid.class));
        cards.add(new SetCardInfo("Invasive Species", 181, Rarity.COMMON, mage.cards.i.InvasiveSpecies.class));
        cards.add(new SetCardInfo("Invisibility", 61, Rarity.COMMON, mage.cards.i.Invisibility.class));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 256, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Jace's Ingenuity", 63, Rarity.UNCOMMON, mage.cards.j.JacesIngenuity.class));
        cards.add(new SetCardInfo("Jace, the Living Guildpact", 62, Rarity.MYTHIC, mage.cards.j.JaceTheLivingGuildpact.class));
        cards.add(new SetCardInfo("Jalira, Master Polymorphist", 64, Rarity.RARE, mage.cards.j.JaliraMasterPolymorphist.class));
        cards.add(new SetCardInfo("Jorubai Murk Lurker", 65, Rarity.UNCOMMON, mage.cards.j.JorubaiMurkLurker.class));
        cards.add(new SetCardInfo("Juggernaut", 220, Rarity.UNCOMMON, mage.cards.j.Juggernaut.class));
        cards.add(new SetCardInfo("Kalonian Twingrove", 182, Rarity.RARE, mage.cards.k.KalonianTwingrove.class));
        cards.add(new SetCardInfo("Kapsho Kitefins", 66, Rarity.UNCOMMON, mage.cards.k.KapshoKitefins.class));
        cards.add(new SetCardInfo("Kinsbaile Skirmisher", 16, Rarity.COMMON, mage.cards.k.KinsbaileSkirmisher.class));
        cards.add(new SetCardInfo("Kird Chieftain", 151, Rarity.UNCOMMON, mage.cards.k.KirdChieftain.class));
        cards.add(new SetCardInfo("Krenko's Enforcer", 152, Rarity.COMMON, mage.cards.k.KrenkosEnforcer.class));
        cards.add(new SetCardInfo("Kurkesh, Onakke Ancient", 153, Rarity.RARE, mage.cards.k.KurkeshOnakkeAncient.class));
        cards.add(new SetCardInfo("Lava Axe", 154, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Leeching Sliver", 102, Rarity.UNCOMMON, mage.cards.l.LeechingSliver.class));
        cards.add(new SetCardInfo("Life's Legacy", 183, Rarity.RARE, mage.cards.l.LifesLegacy.class));
        cards.add(new SetCardInfo("Lightning Strike", 155, Rarity.COMMON, mage.cards.l.LightningStrike.class));
        cards.add(new SetCardInfo("Liliana Vess", 103, Rarity.MYTHIC, mage.cards.l.LilianaVess.class));
        cards.add(new SetCardInfo("Living Totem", 184, Rarity.COMMON, mage.cards.l.LivingTotem.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 244, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Mahamoti Djinn", 275, Rarity.RARE, mage.cards.m.MahamotiDjinn.class));
        cards.add(new SetCardInfo("Marked by Honor", 17, Rarity.COMMON, mage.cards.m.MarkedByHonor.class));
        cards.add(new SetCardInfo("Mass Calcify", 18, Rarity.RARE, mage.cards.m.MassCalcify.class));
        cards.add(new SetCardInfo("Master of Predicaments", 67, Rarity.RARE, mage.cards.m.MasterOfPredicaments.class));
        cards.add(new SetCardInfo("Meditation Puzzle", 19, Rarity.COMMON, mage.cards.m.MeditationPuzzle.class));
        cards.add(new SetCardInfo("Mercurial Pretender", 68, Rarity.RARE, mage.cards.m.MercurialPretender.class));
        cards.add(new SetCardInfo("Meteorite", 221, Rarity.UNCOMMON, mage.cards.m.Meteorite.class));
        cards.add(new SetCardInfo("Midnight Guard", 20, Rarity.COMMON, mage.cards.m.MidnightGuard.class));
        cards.add(new SetCardInfo("Might Makes Right", 156, Rarity.UNCOMMON, mage.cards.m.MightMakesRight.class));
        cards.add(new SetCardInfo("Military Intelligence", 69, Rarity.UNCOMMON, mage.cards.m.MilitaryIntelligence.class));
        cards.add(new SetCardInfo("Mind Rot", 104, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mind Sculpt", 70, Rarity.COMMON, mage.cards.m.MindSculpt.class));
        cards.add(new SetCardInfo("Miner's Bane", 157, Rarity.COMMON, mage.cards.m.MinersBane.class));
        cards.add(new SetCardInfo("Mountain", 262, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 263, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 264, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Naturalize", 185, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Necrobite", 105, Rarity.COMMON, mage.cards.n.Necrobite.class));
        cards.add(new SetCardInfo("Necrogen Scudder", 106, Rarity.UNCOMMON, mage.cards.n.NecrogenScudder.class));
        cards.add(new SetCardInfo("Necromancer's Assistant", 107, Rarity.COMMON, mage.cards.n.NecromancersAssistant.class));
        cards.add(new SetCardInfo("Necromancer's Stockpile", 108, Rarity.RARE, mage.cards.n.NecromancersStockpile.class));
        cards.add(new SetCardInfo("Negate", 71, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Netcaster Spider", 186, Rarity.COMMON, mage.cards.n.NetcasterSpider.class));
        cards.add(new SetCardInfo("Nightfire Giant", 109, Rarity.UNCOMMON, mage.cards.n.NightfireGiant.class));
        cards.add(new SetCardInfo("Nightmare", 276, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Nimbus of the Isles", 72, Rarity.COMMON, mage.cards.n.NimbusOfTheIsles.class));
        cards.add(new SetCardInfo("Nissa's Expedition", 188, Rarity.UNCOMMON, mage.cards.n.NissasExpedition.class));
        cards.add(new SetCardInfo("Nissa, Worldwaker", 187, Rarity.MYTHIC, mage.cards.n.NissaWorldwaker.class));
        cards.add(new SetCardInfo("Obelisk of Urd", 222, Rarity.RARE, mage.cards.o.ObeliskOfUrd.class));
        cards.add(new SetCardInfo("Ob Nixilis, Unshackled", 110, Rarity.RARE, mage.cards.o.ObNixilisUnshackled.class));
        cards.add(new SetCardInfo("Oppressive Rays", 21, Rarity.COMMON, mage.cards.o.OppressiveRays.class));
        cards.add(new SetCardInfo("Oreskos Swiftclaw", 22, Rarity.COMMON, mage.cards.o.OreskosSwiftclaw.class));
        cards.add(new SetCardInfo("Ornithopter", 223, Rarity.COMMON, mage.cards.o.Ornithopter.class));
        cards.add(new SetCardInfo("Overwhelm", 189, Rarity.UNCOMMON, mage.cards.o.Overwhelm.class));
        cards.add(new SetCardInfo("Paragon of Eternal Wilds", 190, Rarity.UNCOMMON, mage.cards.p.ParagonOfEternalWilds.class));
        cards.add(new SetCardInfo("Paragon of Fierce Defiance", 158, Rarity.UNCOMMON, mage.cards.p.ParagonOfFierceDefiance.class));
        cards.add(new SetCardInfo("Paragon of Gathering Mists", 73, Rarity.UNCOMMON, mage.cards.p.ParagonOfGatheringMists.class));
        cards.add(new SetCardInfo("Paragon of New Dawns", 23, Rarity.UNCOMMON, mage.cards.p.ParagonOfNewDawns.class));
        cards.add(new SetCardInfo("Paragon of Open Graves", 111, Rarity.UNCOMMON, mage.cards.p.ParagonOfOpenGraves.class));
        cards.add(new SetCardInfo("Peel from Reality", 74, Rarity.COMMON, mage.cards.p.PeelFromReality.class));
        cards.add(new SetCardInfo("Perilous Vault", 224, Rarity.MYTHIC, mage.cards.p.PerilousVault.class));
        cards.add(new SetCardInfo("Phyrexian Revoker", 225, Rarity.RARE, mage.cards.p.PhyrexianRevoker.class));
        cards.add(new SetCardInfo("Phytotitan", 191, Rarity.RARE, mage.cards.p.Phytotitan.class));
        cards.add(new SetCardInfo("Pillar of Light", 24, Rarity.COMMON, mage.cards.p.PillarOfLight.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plummet", 192, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Polymorphist's Jest", 75, Rarity.RARE, mage.cards.p.PolymorphistsJest.class));
        cards.add(new SetCardInfo("Preeminent Captain", 25, Rarity.RARE, mage.cards.p.PreeminentCaptain.class));
        cards.add(new SetCardInfo("Profane Memento", 226, Rarity.UNCOMMON, mage.cards.p.ProfaneMemento.class));
        cards.add(new SetCardInfo("Quickling", 76, Rarity.UNCOMMON, mage.cards.q.Quickling.class));
        cards.add(new SetCardInfo("Radiant Fountain", 245, Rarity.COMMON, mage.cards.r.RadiantFountain.class));
        cards.add(new SetCardInfo("Raise the Alarm", 26, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Ranger's Guile", 193, Rarity.COMMON, mage.cards.r.RangersGuile.class));
        cards.add(new SetCardInfo("Razorfoot Griffin", 27, Rarity.COMMON, mage.cards.r.RazorfootGriffin.class));
        cards.add(new SetCardInfo("Reclamation Sage", 194, Rarity.UNCOMMON, mage.cards.r.ReclamationSage.class));
        cards.add(new SetCardInfo("Research Assistant", 77, Rarity.COMMON, mage.cards.r.ResearchAssistant.class));
        cards.add(new SetCardInfo("Resolute Archangel", 28, Rarity.RARE, mage.cards.r.ResoluteArchangel.class));
        cards.add(new SetCardInfo("Restock", 195, Rarity.UNCOMMON, mage.cards.r.Restock.class));
        cards.add(new SetCardInfo("Return to the Ranks", 29, Rarity.RARE, mage.cards.r.ReturnToTheRanks.class));
        cards.add(new SetCardInfo("Roaring Primadox", 196, Rarity.UNCOMMON, mage.cards.r.RoaringPrimadox.class));
        cards.add(new SetCardInfo("Rogue's Gloves", 227, Rarity.UNCOMMON, mage.cards.r.RoguesGloves.class));
        cards.add(new SetCardInfo("Rotfeaster Maggot", 112, Rarity.COMMON, mage.cards.r.RotfeasterMaggot.class));
        cards.add(new SetCardInfo("Rummaging Goblin", 159, Rarity.COMMON, mage.cards.r.RummagingGoblin.class));
        cards.add(new SetCardInfo("Runeclaw Bear", 197, Rarity.COMMON, mage.cards.r.RuneclawBear.class));
        cards.add(new SetCardInfo("Sacred Armory", 228, Rarity.UNCOMMON, mage.cards.s.SacredArmory.class));
        cards.add(new SetCardInfo("Sanctified Charge", 30, Rarity.COMMON, mage.cards.s.SanctifiedCharge.class));
        cards.add(new SetCardInfo("Satyr Wayfinder", 198, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));
        cards.add(new SetCardInfo("Scrapyard Mongrel", 160, Rarity.COMMON, mage.cards.s.ScrapyardMongrel.class));
        cards.add(new SetCardInfo("Scuttling Doom Engine", 229, Rarity.RARE, mage.cards.s.ScuttlingDoomEngine.class));
        cards.add(new SetCardInfo("Seismic Strike", 280, Rarity.COMMON, mage.cards.s.SeismicStrike.class));
        cards.add(new SetCardInfo("Selfless Cathar", 31, Rarity.COMMON, mage.cards.s.SelflessCathar.class));
        cards.add(new SetCardInfo("Sengir Vampire", 277, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Seraph of the Masses", 32, Rarity.UNCOMMON, mage.cards.s.SeraphOfTheMasses.class));
        cards.add(new SetCardInfo("Serra Angel", 273, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Shadowcloak Vampire", 113, Rarity.COMMON, mage.cards.s.ShadowcloakVampire.class));
        cards.add(new SetCardInfo("Shaman of Spring", 199, Rarity.COMMON, mage.cards.s.ShamanOfSpring.class));
        cards.add(new SetCardInfo("Shield of the Avatar", 230, Rarity.RARE, mage.cards.s.ShieldOfTheAvatar.class));
        cards.add(new SetCardInfo("Shivan Dragon", 281, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shivan Reef", 246, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Shrapnel Blast", 161, Rarity.UNCOMMON, mage.cards.s.ShrapnelBlast.class));
        cards.add(new SetCardInfo("Siege Dragon", 162, Rarity.RARE, mage.cards.s.SiegeDragon.class));
        cards.add(new SetCardInfo("Siege Wurm", 200, Rarity.COMMON, mage.cards.s.SiegeWurm.class));
        cards.add(new SetCardInfo("Sign in Blood", 114, Rarity.COMMON, mage.cards.s.SignInBlood.class));
        cards.add(new SetCardInfo("Sliver Hive", 247, Rarity.RARE, mage.cards.s.SliverHive.class));
        cards.add(new SetCardInfo("Sliver Hivelord", 211, Rarity.MYTHIC, mage.cards.s.SliverHivelord.class));
        cards.add(new SetCardInfo("Solemn Offering", 33, Rarity.COMMON, mage.cards.s.SolemnOffering.class));
        cards.add(new SetCardInfo("Soulmender", 35, Rarity.COMMON, mage.cards.s.Soulmender.class));
        cards.add(new SetCardInfo("Soul of Innistrad", 115, Rarity.MYTHIC, mage.cards.s.SoulOfInnistrad.class));
        cards.add(new SetCardInfo("Soul of New Phyrexia", 231, Rarity.MYTHIC, mage.cards.s.SoulOfNewPhyrexia.class));
        cards.add(new SetCardInfo("Soul of Ravnica", 78, Rarity.MYTHIC, mage.cards.s.SoulOfRavnica.class));
        cards.add(new SetCardInfo("Soul of Shandalar", 163, Rarity.MYTHIC, mage.cards.s.SoulOfShandalar.class));
        cards.add(new SetCardInfo("Soul of Theros", 34, Rarity.MYTHIC, mage.cards.s.SoulOfTheros.class));
        cards.add(new SetCardInfo("Soul of Zendikar", 201, Rarity.MYTHIC, mage.cards.s.SoulOfZendikar.class));
        cards.add(new SetCardInfo("Spectra Ward", 36, Rarity.RARE, mage.cards.s.SpectraWard.class));
        cards.add(new SetCardInfo("Spirit Bonds", 37, Rarity.RARE, mage.cards.s.SpiritBonds.class));
        cards.add(new SetCardInfo("Stab Wound", 116, Rarity.UNCOMMON, mage.cards.s.StabWound.class));
        cards.add(new SetCardInfo("Staff of the Death Magus", 232, Rarity.UNCOMMON, mage.cards.s.StaffOfTheDeathMagus.class));
        cards.add(new SetCardInfo("Staff of the Flame Magus", 233, Rarity.UNCOMMON, mage.cards.s.StaffOfTheFlameMagus.class));
        cards.add(new SetCardInfo("Staff of the Mind Magus", 234, Rarity.UNCOMMON, mage.cards.s.StaffOfTheMindMagus.class));
        cards.add(new SetCardInfo("Staff of the Sun Magus", 235, Rarity.UNCOMMON, mage.cards.s.StaffOfTheSunMagus.class));
        cards.add(new SetCardInfo("Staff of the Wild Magus", 236, Rarity.UNCOMMON, mage.cards.s.StaffOfTheWildMagus.class));
        cards.add(new SetCardInfo("Stain the Mind", 117, Rarity.RARE, mage.cards.s.StainTheMind.class));
        cards.add(new SetCardInfo("Statute of Denial", 79, Rarity.COMMON, mage.cards.s.StatuteOfDenial.class));
        cards.add(new SetCardInfo("Stoke the Flames", 164, Rarity.UNCOMMON, mage.cards.s.StokeTheFlames.class));
        cards.add(new SetCardInfo("Stormtide Leviathan", 80, Rarity.RARE, mage.cards.s.StormtideLeviathan.class));
        cards.add(new SetCardInfo("Sunblade Elf", 202, Rarity.UNCOMMON, mage.cards.s.SunbladeElf.class));
        cards.add(new SetCardInfo("Sungrace Pegasus", 38, Rarity.COMMON, mage.cards.s.SungracePegasus.class));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 259, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Terra Stomper", 284, Rarity.RARE, mage.cards.t.TerraStomper.class));
        cards.add(new SetCardInfo("The Chain Veil", 215, Rarity.MYTHIC, mage.cards.t.TheChainVeil.class));
        cards.add(new SetCardInfo("Thundering Giant", 165, Rarity.COMMON, mage.cards.t.ThunderingGiant.class));
        cards.add(new SetCardInfo("Tireless Missionaries", 39, Rarity.COMMON, mage.cards.t.TirelessMissionaries.class));
        cards.add(new SetCardInfo("Titanic Growth", 203, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));
        cards.add(new SetCardInfo("Torch Fiend", 166, Rarity.COMMON, mage.cards.t.TorchFiend.class));
        cards.add(new SetCardInfo("Tormod's Crypt", 237, Rarity.UNCOMMON, mage.cards.t.TormodsCrypt.class));
        cards.add(new SetCardInfo("Triplicate Spirits", 40, Rarity.COMMON, mage.cards.t.TriplicateSpirits.class));
        cards.add(new SetCardInfo("Turn to Frog", 81, Rarity.UNCOMMON, mage.cards.t.TurnToFrog.class));
        cards.add(new SetCardInfo("Typhoid Rats", 118, Rarity.COMMON, mage.cards.t.TyphoidRats.class));
        cards.add(new SetCardInfo("Tyrant's Machine", 238, Rarity.COMMON, mage.cards.t.TyrantsMachine.class));
        cards.add(new SetCardInfo("Ulcerate", 119, Rarity.UNCOMMON, mage.cards.u.Ulcerate.class));
        cards.add(new SetCardInfo("Undergrowth Scavenger", 204, Rarity.COMMON, mage.cards.u.UndergrowthScavenger.class));
        cards.add(new SetCardInfo("Unmake the Graves", 120, Rarity.COMMON, mage.cards.u.UnmakeTheGraves.class));
        cards.add(new SetCardInfo("Urborg, Tomb of Yawgmoth", 248, Rarity.RARE, mage.cards.u.UrborgTombOfYawgmoth.class));
        cards.add(new SetCardInfo("Venom Sliver", 205, Rarity.UNCOMMON, mage.cards.v.VenomSliver.class));
        cards.add(new SetCardInfo("Verdant Haven", 206, Rarity.COMMON, mage.cards.v.VerdantHaven.class));
        cards.add(new SetCardInfo("Vineweft", 207, Rarity.COMMON, mage.cards.v.Vineweft.class));
        cards.add(new SetCardInfo("Void Snare", 82, Rarity.COMMON, mage.cards.v.VoidSnare.class));
        cards.add(new SetCardInfo("Walking Corpse", 278, Rarity.COMMON, mage.cards.w.WalkingCorpse.class));
        cards.add(new SetCardInfo("Wall of Essence", 41, Rarity.UNCOMMON, mage.cards.w.WallOfEssence.class));
        cards.add(new SetCardInfo("Wall of Fire", 167, Rarity.COMMON, mage.cards.w.WallOfFire.class));
        cards.add(new SetCardInfo("Wall of Frost", 83, Rarity.UNCOMMON, mage.cards.w.WallOfFrost.class));
        cards.add(new SetCardInfo("Wall of Limbs", 121, Rarity.UNCOMMON, mage.cards.w.WallOfLimbs.class));
        cards.add(new SetCardInfo("Wall of Mulch", 208, Rarity.UNCOMMON, mage.cards.w.WallOfMulch.class));
        cards.add(new SetCardInfo("Warden of the Beyond", 42, Rarity.UNCOMMON, mage.cards.w.WardenOfTheBeyond.class));
        cards.add(new SetCardInfo("Waste Not", 122, Rarity.RARE, mage.cards.w.WasteNot.class));
        cards.add(new SetCardInfo("Welkin Tern", 84, Rarity.COMMON, mage.cards.w.WelkinTern.class));
        cards.add(new SetCardInfo("Will-Forged Golem", 239, Rarity.COMMON, mage.cards.w.WillForgedGolem.class));
        cards.add(new SetCardInfo("Witch's Familiar", 123, Rarity.COMMON, mage.cards.w.WitchsFamiliar.class));
        cards.add(new SetCardInfo("Xathrid Slyblade", 124, Rarity.UNCOMMON, mage.cards.x.XathridSlyblade.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 249, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yisan, the Wanderer Bard", 209, Rarity.RARE, mage.cards.y.YisanTheWandererBard.class));
        cards.add(new SetCardInfo("Zof Shade", 125, Rarity.COMMON, mage.cards.z.ZofShade.class));
    }
}
