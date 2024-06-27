XposedHelpers.findAndHookMethod(
                        "org.telegram.messenger.MessagesStorage",
                        lpparam.classLoader,
                        "markMessagesAsDeleted",
                        long.class,
                        ArrayList.class,
                        boolean.class,
                        boolean.class,
                        int.class,
                        int.class,
                        new XC_MethodReplacement() {
                            @Override
                            protected Object replaceHookedMethod(MethodHookParam param) {
                                try {
                                    XposedBridge.log("markMessagesAsDeleted");
                                    param.setResult(null);
                                } catch (Throwable t) {
                                    XposedBridge.log(t);
                                }
                                return null;
                            }

                        });
