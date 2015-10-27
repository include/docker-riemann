# Run it

Riemann relies on a configuration file ```riemann.config```.
This is the starting point, where global configurations are set. Because I
don't like huge files and I like to keep things simple, I want to define a
directory where I load all my custom Riemann configurations.

We have two distint ways of doing so...

Shipping your custom Riemann configurations within docker:

```sh
    docker run -d \
        -p 5555:5555/udp \
        -p 5555:5555/tcp \
        -p 5556:5556/tcp \
        -e UDP_PORT=5555 \
        -e TCP_PORT=5555 \
        -e WSE_PORT=5556 \
        -e HOST=0.0.0.0  \
        -e CONFDIR=/app/etc \
        include/docker-riemann
```

Or mounting a volume with your custom Riemann configurations:

```sh
    docker run -d \
        -p 5555:5555/udp \
        -p 5555:5555/tcp \
        -p 5556:5556/tcp \
        -e UDP_PORT=5555 \
        -e TCP_PORT=5555 \
        -e WSE_PORT=5556 \
        -e HOST=0.0.0.0  \
        -e VOLUME="/path-to-volume" \
        -v /path-to-volume:/path-to-volume \
        include/docker-riemann
```

Both ways will configure properly ```riemann.config```.
