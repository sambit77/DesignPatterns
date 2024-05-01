package com.example.designpatterns.strategypattern.filecompression;
import java.util.*;
public interface CompressionStrategy {
    
    void compressFiles(List<String> fileList);
}
