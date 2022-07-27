package com.android.mobile.alteacaretest.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.android.mobile.alteacaretest.model.detail.MovieList
import com.android.mobile.alteacaretest.room.converters.MovieListConverters

@Entity(tableName = "MovieComingSoonResponse")
data class MovieComingSoonResponseData (
    @PrimaryKey(autoGenerate = false)
    var id: Int = 1,

    @TypeConverters(MovieListConverters::class)
    @ColumnInfo(name = "listComingSoonMovie")
    var items: ArrayList<MovieList>,

    @ColumnInfo(name = "errorMessage")
    var errorMessage: String,
)