package org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "movieEntities")
@Parcelize
data class MovieEntity (
    @PrimaryKey
    @NonNull
    @ColumnInfo
    var movieId: String,

    @ColumnInfo
    var type: String,

    @ColumnInfo
    var title: String,

    @ColumnInfo
    var synopsis: String,

    @ColumnInfo
    var genre: String,

    @ColumnInfo
    var duration: String,

    @ColumnInfo
    var director: String,

    @ColumnInfo
    var rating: String,

    @ColumnInfo
    var image: String,

    @ColumnInfo(name = "favorite")
    var favorite: Boolean = false
) : Parcelable