package me.bristermitten.entityshop.shop.impl

import org.bukkit.entity.Entity

/**
 * @author AlexL
 */
data class EntityShop(val entity: Entity, override val name: String) : AbstractShop(name)
