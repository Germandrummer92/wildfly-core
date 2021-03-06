/*
 * Copyright 2016 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.test.jmx;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Emmanuel Hugonnet (c) 2016 Red Hat, inc.
 */
public class ProcessStateNotificationListener extends AbstractStateNotificationListener {

    public static final String JMX_DIRECT_FILE = "jmx-direct";
    private final Path targetFile;

    public ProcessStateNotificationListener() {
        this.targetFile = Paths.get("target/notifications/data").resolve(JMX_DIRECT_FILE).toAbsolutePath();
        init(targetFile);
    }

    @Override
    protected Path getTargetFile() {
        return this.targetFile;
    }

}
