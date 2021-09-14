Question: https://discuss.axoniq.io/t/generic-command-handler/3588

> Hello,
>
> I have a question concerning Command Handlers. Is it currently possible, to use base classes or interfaces that are implemented by various commands and get all subclasses intercepted by the same @CommandHandler? Thank you very much in advance.
---

This sample application should show the order of which Commands, while in a hierarchy using either `extends` or `implements` should follow.

In short, the most specific `@CommandHandler` method will be called.