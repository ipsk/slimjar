package io.github.vshnv.slimjar.resolver.reader;


import io.github.vshnv.slimjar.resolver.data.DependencyData;

public interface DependencyDataProvider {
    DependencyData get();
}