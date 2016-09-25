package autovalue.testing.oldering.io.myapplication;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Foo {
    abstract String bar();

//    public static TypeAdapter<Foo> typeAdapter(Gson gson) {
//        return new AutoValue_Foo.GsonTypeAdapter(gson);
//    }
}