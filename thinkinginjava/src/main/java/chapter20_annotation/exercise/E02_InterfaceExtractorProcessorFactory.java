package chapter20_annotation.exercise;

import chapter20_annotation.aptAnnotationProcessor.InterfaceExtractorProcessor;
import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * Created by xhtc on 2017/8/4.
 */
public class E02_InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory{

    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        return Collections.singleton("chapter20_annotation.aptAnnotationProcessor.ExtractInterface");
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }
}

