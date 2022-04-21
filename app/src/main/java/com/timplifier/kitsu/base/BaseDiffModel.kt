package com.timplifier.kitsu.base

interface BaseDiffModel {
    val value: Any
    override fun equals(other: Any?): Boolean

}