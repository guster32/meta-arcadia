require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append=" dev-pkgs"

IMAGE_ROOTFS_EXTRA_SPACE:qemux86-64 = "41943040"
EXTRA_IMAGE_FEATURES:append:qemux86-64="\
      dbg-pkgs \
      tools-debug \
      tools-profile \
      tools-testapps \
      debug-tweaks \
      tools-sdk \
      dev-pkgs"

# Specifies to build packages with debugging information
DEBUG_BUILD:qemux86-64="1"

# Do not remove debug symbols
INHIBIT_PACKAGE_STRIP:qemux86-64="1"

# OPTIONAL: Do not split debug symbols in a separate file
INHIBIT_PACKAGE_DEBUG_SPLIT:qemux86-64="1"

IMAGE_INSTALL:append:qemux86-64=" \
  openssh \
  openssh-sftp \
  openssh-sftp-server \
  packagegroup-core-buildessential \
  cmake \
  ninja \
  clang \
  lldb \
  lldb-server \
  vim \
  git \
  curl \
  wget \
  htop \
  iftop \
  libtool \
  ldd \
  bash \
  coreutils \
  e2fsprogs \
  e2fsprogs-resize2fs \
  e2fsprogs-tune2fs \
  findutils \
  gawk \
  grep \
  less \
  net-tools \
  parted \
  pciutils \
  procps \
  sed \
  util-linux \
  which "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

