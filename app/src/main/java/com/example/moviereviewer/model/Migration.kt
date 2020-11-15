package com.example.moviereviewer.model

import io.realm.DynamicRealm
import io.realm.RealmList
import io.realm.RealmMigration

open class Migration : RealmMigration{

    override fun migrate(realm: DynamicRealm?, oldVersion: Long, newVersion: Long) {
        val schema = realm?.schema
        var curVersion = oldVersion
        if(curVersion == 2.toLong()){
//            println("Migration Doing")
//            schema!!.create("DtbGenre")
//                .addField("GenreLocalD", String::class.java)
//                .addField("GenreID", String::class.java)
//                .addField("GenreName", String::class.java)
//
//            schema!!.create("DtbMovie")
//                .addField("MovieLocalID", String::class.java)
//                .addField("MovieID", String::class.java)
//                .addField("BackDropPath", String::class.java)
//                .addField("Title", String::class.java)
//                .addField("Adult", Boolean::class.java)
//                .addField("OriginalTitle", String::class.java)
//                .addField("OriginalLanguage", String::class.java)
//                .addField("PosterPath", String::class.java)
//                .addField("VoteAverage", String::class.java)
//                .addField("Overview", String::class.java)
//                .addField("ReleaseDate", String::class.java)
//                .addField("VoteCount", String::class.java)
//                .addField("Genre", String::class.java)
//
//            println("Migration Done")
            curVersion++
            oldVersion.inc()
        }
    }

}