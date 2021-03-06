package org.skychipmunk.data.treasurechest

import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerInteractEvent
import org.skychipmunk.abstraction.ITreasureChest
import org.skychipmunk.util.closeChest
import org.skychipmunk.util.openChest

class CloseTreasureChest: ITreasureChest {

    override fun Block.onInteracted(player: Player) {
        if (player.inventory.itemInMainHand.type != Material.TRIPWIRE_HOOK) {
            player.sendMessage("§c열쇠롤 가지고 열어주세요.")
            closeChest()
            return
        }else {
            openChest()
            return
        }
    }

}