package com.example.whatschat.listeners

import com.example.whatschat.util.StatusListElement

interface StatusItemClickListener {
    fun onItemClicked(statusElement: StatusListElement)
}