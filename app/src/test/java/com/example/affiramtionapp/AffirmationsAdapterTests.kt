package com.example.affiramtionapp

import android.content.Context
import android.util.Log
import com.example.affiramtionapp.adapter.ItemAdapter
import com.example.affiramtionapp.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data =listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context,data)
        assertEquals("ItemAdapter is not correct size", data.size,adapter.itemCount)
    }

    @Test
    fun data_exist(){
        val data =listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        assertEquals("Data is empty",data.isEmpty(),false)
    }


}