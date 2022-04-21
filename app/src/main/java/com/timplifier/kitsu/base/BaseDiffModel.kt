package com.timplifier.kitsu.base

interface BaseDiffModel<T> {
    val id: T
    override fun equals(other: Any?): Boolean

}