require recipes-core/images/core-image-minimal.bb

SUMMARY = "Custom configuration for core-image-minimal build for Rpi4"

IMAGE_INSTALL += "vim"
IMAGE_INSTALL += "htop"
IMAGE_INSTALL += "static-ip"
IMAGE_INSTALL += "openssh"

IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_FEATURES += "allow-empty-password"
IMAGE_FEATURES += "empty-root-password"
IMAGE_FEATURES += "allow-root-login"
