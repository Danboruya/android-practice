package dev.techpleiades.buttonmashing

import androidx.lifecycle.MutableLiveData

class GameViewModel {
    val count = MutableLiveData<Int>(0)
    val countText = MutableLiveData<String>("0 times")

    fun onClick() {
        count.value = (count.value ?: 0) + 1
        countText.value = "${count.value} times"
    }
}