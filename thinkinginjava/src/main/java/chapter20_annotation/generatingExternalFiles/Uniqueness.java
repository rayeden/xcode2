package chapter20_annotation.generatingExternalFiles;

/**
 * Created by xhtc on 2017/8/2.
 */

public @interface Uniqueness {

    Constraints constraints() default @Constraints(unique = true);

}
