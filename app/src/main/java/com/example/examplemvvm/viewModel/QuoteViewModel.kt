package com.example.examplemvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.model.QuoteModel
import com.example.examplemvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
       val currentQuote: QuoteModel = QuoteProvider.random()
       quoteModel.postValue(currentQuote)
    }
}