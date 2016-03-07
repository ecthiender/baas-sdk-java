package io.hasura.db;

import com.google.gson.reflect.*;
import java.lang.reflect.Type;

import java.util.ArrayList;

import io.hasura.db.DeleteResult;
import io.hasura.db.InsertResult;
import io.hasura.db.UpdateResult;

class Review extends Table<ReviewRecord> {

    public static final Review REVIEW = new Review();

    public Review() {
        super("review");
    }

    public Type getInsResType() {
        return new TypeToken<InsertResult<ReviewRecord>>() {}.getType();
    }

    public Type getSelResType() {
        return new TypeToken<ArrayList<ReviewRecord>>() {}.getType();
    }

    public Type getUpdResType() {
        return new TypeToken<UpdateResult<ReviewRecord>>() {}.getType();
    }

    public Type getDelResType() {
        return new TypeToken<DeleteResult<ReviewRecord>>() {}.getType();
    }

    public final PGField<ReviewRecord, Integer> RATING = new PGField<>("rating");
    public final PGField<ReviewRecord, Integer> ID = new PGField<>("id");
    public final PGField<ReviewRecord, Boolean> IS_ACTIVE = new PGField<>("is_active");

}
