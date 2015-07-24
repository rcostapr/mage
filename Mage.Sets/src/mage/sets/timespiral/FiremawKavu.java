/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.timespiral;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.LeavesBattlefieldTriggeredAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.keyword.EchoAbility;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Rarity;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author fireshoes
 */
public class FiremawKavu extends CardImpl {

    public FiremawKavu(UUID ownerId) {
        super(ownerId, 153, "Firemaw Kavu", Rarity.UNCOMMON, new CardType[]{CardType.CREATURE}, "{5}{R}");
        this.expansionSetCode = "TSP";
        this.subtype.add("Kavu");
        this.power = new MageInt(4);
        this.toughness = new MageInt(2);

        // Echo {5}{R}
        this.addAbility(new EchoAbility("{5}{R}"));
        
        // When Firemaw Kavu enters the battlefield, it deals 2 damage to target creature.
        Ability ability = new EntersBattlefieldTriggeredAbility(new DamageTargetEffect(2));
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
        
        // When Firemaw Kavu leaves the battlefield, it deals 4 damage to target creature.
        ability = new LeavesBattlefieldTriggeredAbility(new DamageTargetEffect(4), false);
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public FiremawKavu(final FiremawKavu card) {
        super(card);
    }

    @Override
    public FiremawKavu copy() {
        return new FiremawKavu(this);
    }
}