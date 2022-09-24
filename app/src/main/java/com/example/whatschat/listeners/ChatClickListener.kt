package com.example.whatschat.listeners

interface ChatClickListener {
    fun onChatClicked(name: String?, otherUserId: String?, chatImageUrl: String?, chatName: String?)
}