package com.timplifier.kitsu.base

interface BaseDiffModel<T> {
    val value: T
    override fun equals(other: Any?): Boolean

}